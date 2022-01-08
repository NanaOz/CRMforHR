const popupLinks = document.querySelectorAll('.popup-link'); //получаем все объекты из popup-link
const body = document.querySelector('body'); //в body получаем сам тэг
const lockPadding = document.querySelectorAll(".lock-padding"); //нужен для фиксированных объектов

let unlock = true; //что бы не было двойных нажатий

const timeout = 800; //для адекватности скрола!как и в css-popup

if (popupLinks.length > 0) {
    for (let index = 0; index<popupLinks.length; index++) {
        const popupLink = popupLinks [index];
        popupLink.addEventListener("click", function (e){  //вешаем событие клик
            const popupName = popupLink.getAttribute('href').replace('#', '')  //для получения чистого имени popup
            const currentPopup = document.getElementById(popupName);
            popupOpen(currentPopup); //открытие попапа
            e.preventDefault() //запрещаем перезагрузку страницы
        })
    }
}
const popupCloseIcon = document.querySelectorAll('.close-popup');
if (popupCloseIcon.length > 0) {
    for (let index = 0; index < popupCloseIcon.length; index++) {
        const el = popupCloseIcon [index];
        el.addEventListener('click', function (e) {
            popupClose(el.closest('.popup'));
            e.preventDefault()
        })
    }
}
function popupOpen (currentPopup) { //ипередаем готовый объект
    if (currentPopup && unlock) { //проверяем есть ли и открыт ли
        const popupActive = document.querySelector('.popup.open'); //это если попап в попапе
        if (popupActive) {
            popupClose(popupActive, false);
        }
        else {
            bodyLock(); //скрытие скрола
        }
        currentPopup.classList.add('open'); //к нашему оппапу добавляем класс open css
        currentPopup.addEventListener("click", function (e) {
            if (!e.target.closest('.popup_content')) { //отсекаем все, кроме темной области
                popupClose(e.target.closest('.popup'));
            }
        });
    }
}
function popupClose (popupActive, doUnlock = true) { // передаем активнй объект, и стоит ли блокирование скрола
    if (unlock) {
        popupActive.classList.remove('open'); //убираем у активного попапа класс опен
        if (doUnlock) {
            bodyUnlock();
        }
    }
}
function bodyLock() { //скрытие скрола
    const lockPaddingValue = window.innerWidth - document.querySelector('.wrapper').offsetWidth + 'px'; //высчитываем разницу между шириной всего окна и объекта, который находится внутри

    if (lockPadding.length > 0) { //проверка на существование таких объектов
        for (let index = 0; index < lockPadding.length; index++) { //делаем то же самое с меню
            const el = lockPadding[index];
            el.style.paddingRight = lockPaddingValue;
        }
    }
    body.style.paddingRight = lockPaddingValue; //присваиваем это значение самому body
    body.classList.add('lock'); //добаваляем lock, по этому классу скрол убирается

    unlock = false; //чтобы не было повторных нажатий, избежание ошибки фиксированнного скрола
    setTimeout(function () {
        unlock = true;
    }, timeout)
}
function bodyUnlock () {
    setTimeout(function (){
        if (lockPadding.length > 0) {
            for (let index = 0; index < lockPadding.length; index++) {
                const el = lockPadding[index];
                el.style.paddingRight = '0px';
            }
        }
        body.style.paddingRight = '0px'; //убираем padding у body
        body.classList.remove('lock'); //убираем класс lock
    }, timeout); //что бы при закрытии попапа скрол появлялся через время

    unlock = false;
    setTimeout(function (){
        unlock = true;
    }, timeout)
}



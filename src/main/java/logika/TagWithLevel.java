package logika;

import com.company.entity.Tag;

public class TagWithLevel {
    private Tag tag;
    private int level;

    public TagWithLevel(Tag tag,int level){
        this.tag=tag;
        this.level=level;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

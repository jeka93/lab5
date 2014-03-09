package ru.gorbacev.lab5_stp;

import java.util.Comparator;

import ru.gorbacev.lab5_stp.Polygon;

public class SortMode implements Comparator<Polygon>{
    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
}

    @Override
    public int compare(Polygon b1, Polygon b2) {
    int res=0;
    if (sortMode==0){
        if (b1.getId()>b2.getId()) res=1;
            else if (b1.getId()<b2.getId()) res=-1;
    }
    else if (sortMode==1){
        res=b1.getName().compareTo(b2.getName());
    }
    else if (sortMode==2) {
        if (b1.getPerimetr()>b2.getPerimetr()) res=1;
            else if (b1.getPerimetr()<b2.getPerimetr()) res=-1;
    }
    else if (sortMode==3) {
        if (b1.getSquare()>b2.getSquare()) res=1;
            else if (b1.getSquare()<b2.getSquare()) res=-1;
    }
    if (sortUp) res*=(-1);
    
    return res;
    }
}

package base.collection.hashset;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class R {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString(){
       return "R[count:"+count+"]";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(obj !=null && obj.getClass() == R.class){
            R r = (R)obj;
            return r.count == this.count;
        }
        return false;

    }

    public int hashCode(){
        return this.count;
    }
}

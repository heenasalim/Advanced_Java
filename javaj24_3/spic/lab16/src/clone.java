
public class clone   implements Cloneable{
  
int  dd,mm,yy;

@Override
public String toString() {
	return "clone [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}

public clone(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

public  Object  clone()
{
clone c=new  clone(this.dd,this.mm,this.yy);
return  c;

}

}
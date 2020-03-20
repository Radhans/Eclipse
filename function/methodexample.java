package function;

public class methodexample {
	public int x=10;
	public int y=20;
	
	public int sum() { return(x+y); }
	
	public int sum(int x,int y) { return(x+y); }
	
	public float sum(float x,int y) { return(x+y); }
	
	public float sum(int x,float y) { return(x+y); }
	
	public int sum(int x,int y,int z) { return(x+y+z); }
	
	public String sum(String f,String l) { return(f+l); }
	
	public int sum(int...x) {
		int y=0;
		for(int i:x)
		{
			y=y+i;
		}
		return y;
	}
	
	public String sum(String... names) {
		String temp="";
		for(String i:names)
		{
			 temp=temp+i+" ";
			//System.out.println(i);
		}
		return temp;
	}
	
}

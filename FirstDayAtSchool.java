package junit;

import java.util.Arrays;

public class FirstDayAtSchool {
	public boolean res;
	public void checkmyName(String myname)
	{
		if(myname.compareTo("Dileep")==0)
			res=true;
		else
			res=false;
	}
	
		public String[] prepareMyBag()
		{
		
		String[] schoolbag= {"Books","NoteBooks","Pens"};
		System.out.println("my school bag contains:"+Arrays.deepToString(schoolbag));
		return schoolbag;
		}
		public String[] addPencil() {
			String[] schoolbag= {"Books","NoteBooks","Pens","Pencils"};
			System.out.println("now my school bag contains"+Arrays.toString(schoolbag));
			return schoolbag;
		}
		public static void main(String[] args) {
			FirstDayAtSchool fds=new FirstDayAtSchool();
			String[] sb=fds.prepareMyBag();
			System.out.println(sb);
			for(String s:sb)
			{
				System.out.println("Bag contains:"+s);
			}
			String[] pencil=fds.addPencil();
			for(String s:pencil)
			{
				System.out.println("pencil box contains:"+s);
			}
		}
		
	}



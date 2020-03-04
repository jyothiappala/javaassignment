import java.util.*;
import java.util.Map.Entry;

class HashMapCountry
{
	  HashMap<String,String> sortByValue(HashMap<String, String> hm) 
	    { 
		  Set<Entry<String,String>> set=hm.entrySet();
		  ArrayList<String> list=new ArrayList<String>();
		  LinkedHashMap<String,String> lmap=new LinkedHashMap<String,String>();
	      for(Entry<String,String> e:set)
	      {
	    	  list.add(e.getValue());
	      }
	      Collections.sort(list);
	      Iterator<String> itr=list.iterator();
	      while(itr.hasNext())
	      {
	    	  String s=itr.next();
		      for(Entry<String,String> e:set)
		      {
		    	  if(s==e.getValue())
		    	  {
		    		  lmap.put(e.getKey(),e.getValue());
		    	  }
		      }
	      }
		  return lmap; 
	    } 
}
class HashMapDemo{

	public static void main(String[] args) 
	{
		HashMap<String,String>hm=new HashMap<String,String>();
		HashMapCountry hm1=new HashMapCountry();
		hm.put("Nepal","katmandu");
		hm.put("India","Delhi");
		hm.put("Pakistan","Islamabad");
		System.out.println("Before Sorting");
		System.out.println(hm);
		System.out.println("After Sorting");
		Map<String, String> hm2 = hm1.sortByValue(hm);
		for(Map.Entry<String,String> e:hm2.entrySet())
				System.out.println(e.getKey()+"="+e.getValue());
	}
}






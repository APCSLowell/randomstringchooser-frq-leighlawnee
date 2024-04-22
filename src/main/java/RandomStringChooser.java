import java.util.*;
public class RandomStringChooser
{
private ArrayList <String> ogString;

public RandomStringChooser(String[] str){
ogString = new ArrayList<String>();
  for(String i : str){
    ogString.add(i);
  }
}

public String getNext(){

  if(ogString.size() == 0)
    return "NONE";
  else{
    int j = (int)(Math.random()*ogString.size());
    String temp = ogString.get(j);
    ogString.remove(j);
    return temp;
}
}
}

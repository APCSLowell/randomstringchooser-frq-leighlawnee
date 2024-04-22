import java.util.*;
public class RandomStringChooser
{
private ArrayList ogString;

public RandomStringChooser(String[] str){
ogString = new ArrayList<String>();
  for(String i : str){
    ogString.add(i);
  }
}

public String getNext(){
String temp = “”;
  if(ogString.size() == 0)
    return "NONE";
  else{
    int j = (int)(Math.random()*ogString.size());
    temp = ogString.get(j);
    ogString.remove(j);
    return temp;
}
}
}

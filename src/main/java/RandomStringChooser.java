import java.util.*;
public class RandomStringChooser
{
private ArrayList ogString;

RandomStringChooser(String[] str){
ogString =  = new Array<String>();
  for(String i : str){
    ogString.add( i);
  }
}

public String getNext(){
String temp = “”;
  if(ogString.size()>0){
    int j = (int)(Math.random()*ogString.size());
    temp = ogString.get(j);
    ogString.remove(j);
    return temp;
}else
    return “NONE”;
}
}

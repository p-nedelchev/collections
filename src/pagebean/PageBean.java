package pagebean;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by clouway on 10.05.16.
 */
public class PageBean {
  private Integer pagesize;
  private String content;
  private Map<Integer, String> pages = new LinkedHashMap<>();
  private Integer step = 0;
  private Integer numberofpages;
  private Integer key=0;

  public PageBean(Integer pagesize, String content) {
    this.pagesize = pagesize;
    this.content = content;
    this.numberofpages = (content.length() / pagesize) + (content.length() % pagesize);
  }

  public void createPages() {
    for (Integer i = 0; i < numberofpages; i++) {
      String currentstring = "";
      for (Integer j = 0; j < pagesize; j++) {
        if (step == content.length()) {
          break;
        }
        currentstring += content.charAt(step);
        step++;
      }
      pages.put(i, currentstring);
    }
  }
  public String next(){
    key++;
    return "Page"+key+"\n"+pages.get(key-1);
  }
  public String previous(){
    return "Page"+(key-1)+"\n"+pages.get((key-2));
  }
  public boolean hasPrevious(){
    if(key>1){
      return true;
    }
    return false;
  }
  public boolean hasNext(){
    if(key<numberofpages-1){
      return true;
    }
    return false;
  }
  public String firstPage(){
    key=1;
    return "Page1\n"+pages.get(key-1);
  }
  public String lastPage(){
    key=numberofpages-1;
    return "Page"+(numberofpages)+"\n"+pages.get(numberofpages-1);
  }
  public Integer getCurrentPageNumber(){
    return key;
  }




}





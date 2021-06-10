import java.util.List;

public class RuleMatching {
    public static void main(String[] args) {
        //System.out.println(countMatches(items,ruleKey,ruleValue);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                count=count+1;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                count=count+1;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                count=count+1;
            }
        }
        return count;
    }
}

class Solution {
  public static void main(String [] args){
      String s="silent";
      String t="listen";
     String res=(isAnagram(s,t))? "Anagram" : "not Anagram";
     System.out.println(res);
  }
    public boolean isAnagram(String s, String t) {
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        s=new String(ch1);
        t=new String(ch2);

        boolean flag=(s.equals(t))?true:false;
        return flag;
    }
}

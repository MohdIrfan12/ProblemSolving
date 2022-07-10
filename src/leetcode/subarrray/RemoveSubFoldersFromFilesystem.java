package leetcode.subarrray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveSubFoldersFromFilesystem {
    /*
    Given a list of folders folder, return the folders after removing all sub-folders in those folders.
    You may return the answer in any order.

   If a folder[i] is located within another folder[j], it is called a sub-folder of it.
   The format of a path is one or more concatenated strings of the form: '/' followed by one or more lowercase English letters.

   For example, "/leetcode" and "/leetcode/problems" are valid paths while an empty string and "/" are not.
  */
    public static void main(String[] args) {
        String arr[] = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> res = bruteforce(arr);
        for (String item : res) {
            System.out.println(item);
        }
    }

    private static List<String> bruteforce(String[] folder) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < folder.length; i++) {
            String item = folder[i];
            if (item != null) {
                if(item.charAt(item.length()-1)!='/'){
                    item = item+"/";
                }
                for (int j = i + 1; j < folder.length; j++) {
                    String item2 = folder[j];
                    if(item2!=null){
                        if (item2.startsWith(item)) {
                            folder[j] = null;
                        }else {
                            if(item2.charAt(item2.length()-1)!='/'){
                                item2 = item2+"/";
                                if (item.startsWith(item2)) {
                                    folder[i] = null;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < folder.length; i++) {
            String item = folder[i];
            if (item != null) {
                list.add(item);
            }
        }
        return list;
    }


    private static List<String> optimised(String[] folder) {
        List<String> list = new ArrayList<>();
        Arrays.sort(folder);
        list.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String curItem = folder[i];
            String prevItem = list.get(list.size()-1);
            int prevItemLength = prevItem.length();
            if(curItem.length()>prevItemLength&& curItem.charAt(prevItemLength)=='/'
            && curItem.substring(0,prevItemLength).equals(prevItem)){
                continue;
            }
            list.add(curItem);
        }
        return list;
    }
}

package 字符串问题;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Houskii on 17/2/8.
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 测试样例：
 "abc",3,"bca",3
 返回：true

 */
public class 词语变形 {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
        Map map = new Map();
        for (char a:A.toCharArray()){
            map.entities[a].value++;
        }

        for (char b:B.toCharArray()){
            map.entities[b].value--;
        }

        for (Map.Entity entity:map.entities){
            if (entity.value!=0){
                return false;
            }
        }
        return true;
    }


    class Map{
        Entity[] entities ;

        public Map() {
            entities = new Entity[150];
            for (int i = 0;i<entities.length;i++){
                entities[i] = new Entity();
                entities[i].key = i;
                entities[i].value = 0;
            }
        }

        class Entity{
            int key;
            int value;
        }
    }

}

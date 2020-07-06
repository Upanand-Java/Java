package missiondsa180Ques.hastable;

import java.util.*;

public class SubDomains {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = new LinkedList<>();
        HashSet<String> hm = new HashSet<>();

        for(int i=0;i<cpdomains.length;i++){
            String[] domainWithCOunt = cpdomains[i].split(" ");
            String[] domainName = domainWithCOunt[1].split("\\.");
            if (domainName.length > 2) {
                    System.out.println("inside");
                    hm.add(domainWithCOunt[1]);
                    hm.add(domainName[1] + "." + domainName[2]);
                    hm.add(domainName[2]);
            } else {
                    hm.add(domainWithCOunt[1]);
                    hm.add(domainName[1]);
                }

        }
        HashMap<String, Integer> res = new HashMap<>(hm.size());
        for(String j: hm){
            res.put(j,0);
        }
        for(int i=0;i<cpdomains.length;i++) {
            String[] domainWithCOunt = cpdomains[i].split(" ");
            int val = Integer.parseInt(domainWithCOunt[0]);
            System.out.println(val);

            String[] domainName = domainWithCOunt[1].split("\\.");
            if (domainName.length > 2) {
                if (res.containsKey(domainWithCOunt[1])){
                    res.put(domainWithCOunt[1],res.get(domainWithCOunt[1])+val);
                } if(res.containsKey(domainName[1] + "." + domainName[2])){
                    res.put(domainName[1] + "." + domainName[2],res.get(domainName[1] + "." + domainName[2])+val);
                } if(res.containsKey(domainName[2])){
                    res.put(domainName[2],res.get(domainName[2])+val);
                }
            }else {
                if(res.containsKey(domainWithCOunt[1])){
                    res.put(domainWithCOunt[1],res.get(domainWithCOunt[1])+val);
                } if(res.containsKey(domainName[1])){
                    res.put(domainName[1],res.get(domainName[1])+val);
                }

            }

        }
        String temp = "";
        for(String resultMap: res.keySet()){
            temp = res.get(resultMap)+" "+resultMap;
            result.add(temp);
            temp = "";
        }

        System.out.println("list");
        System.out.println(result);
    }
}



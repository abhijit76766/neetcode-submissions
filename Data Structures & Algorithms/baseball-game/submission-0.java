class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();


        for(String op : operations){

            switch(op) {
                case "+" :


                int last = scores.get(scores.size() - 1);
                int secondlast = scores.get(scores.size() - 2);
                scores.add(last + secondlast);
                break;

                case "C" :

                    scores.remove(scores.size() - 1);
                    break;
                

                case "D" :

                    scores.add(2*scores.get(scores.size() - 1));
                    break;

                default :

                scores.add(Integer.parseInt(op));  

            }
        } 

        

          int sum = 0;
            for(int num : scores){
                sum += num;
            }

        return sum;
        
    }
}
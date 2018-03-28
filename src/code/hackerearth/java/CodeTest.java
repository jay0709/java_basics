package code.hackerearth.java;

class CodeTest {

    static int count= 0;
    static String startTime = "10:00:00";
    static String time = null;
    
   
    public static void main(String args[] ) throws Exception {
    		
            String range = createFlow();
            int counter = getAllMatchingCounts(range);
            System.out.println(counter);
    }
    
     public static int getAllMatchingCounts(String timerange){
        String [] time = timerange.split(":");
        
        if(time[0].equals(time[1]) || time[1].equals(time[2])||time[0].equals(time[2])){
            count++;
        }
        return(count);
    }
     
     public static String createFlow(){
    	 String[] spliting = startTime.split(":");
    	 int hour = Integer.parseInt(spliting[0]);
    	 int min = Integer.parseInt(spliting[1]);
    	 int sec = Integer.parseInt(spliting[2]);
    	 
    	 for(int i = 0;i<60;i++){
    		 for(int j=0;j<60;j++){
    			 sec++;
    			 String time = Integer.toString(hour)+":"+Integer.toString(min)+":"+Integer.toString(sec);
    		 }
    		 String time = Integer.toString(hour)+":"+Integer.toString(min)+":"+Integer.toString(sec);
    	 }
		return time;
    	 
     }
}
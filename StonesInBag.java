public class StonesInBag {
    public static void main(String[] args){
    	
    	int stoneCount = 0;
    	while(stoneCount < 20) {
    		if (Math.random() > 0.4){
    		    System.out.println("This stone is yellow");
    		}
    		else{
    		    System.out.println("This stone is purple.");
    		}
    	stoneCount ++;
    	}
    }
}


public void testFrancMultiplication() {
   Franc five = new Franc(5);
   assertEquals(new Franc(10), five.times(2));
   assertEquals(new Franc(15), five.times(3));
}

class Franc {   
   Franc(int amount) {      
      this.amount= amount;
    }					
    
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
				
}
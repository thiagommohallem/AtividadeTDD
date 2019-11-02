class Dollar extends Money{
   int amount;
   private String currency;
   Dollar(int amount, String currency) {
      supper(amount,currency)
   }

   Money times(int multiplier)  {
      return money.dollar(amount * multiplier);
   }

   String currency() {
      return currency;
   }	
}


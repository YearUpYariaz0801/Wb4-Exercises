package com.pluralsight;

public class Reservations {

    private String roomType;

    private int numberofNights;
    private boolean isWeekend;

    public int kingRoomPricePerNight = 139;
    public int doubleRoomPricePerNight = 124;


   double weekendKingPerNight = (kingRoomPricePerNight * 1.10 );
   double weekendDoublePerNight = (doubleRoomPricePerNight * 1.10);




   public Reservation(String roomType, int numberofNights, boolean isWeekend) {
       this.roomType = roomType;
       this.numberofNights = numberofNights;
       this.isWeekend = isWeekend;

        }

   public String getRoomType(){
       return this.roomType;
   }

   public void  setRoomType(String roomType) {
       this.roomType = roomType;
   }

   public int getNumberofNights() {
       return this.numberofNights;
   }

   public boolean isWeekend() {
       return this.isWeekend;
   }


}

#method:post
#path:"/parkingLots"
#添加parkingLot
```java
 @PostMapping("/parkingLots")
    @ResponseBody
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot) {
        return ParkingLotService.addParkingLot( parkingLot );
    }
```

#method:get
#path:"/parkingLots"
#查询parkingLot
```java
 @GetMapping("/parkingLots")
     @ResponseBody
     public List<ParkingLot> findAllParkingLot() {
         return ParkingLotService.findAllParkingLot(  );
     }
```

#method:get
#path:"/parkingBoys"
#查询parkingBoys
```java
    @GetMapping("/parkingBoys")
    @ResponseBody
    public List <ParkingBoy> findAllParkingBoy() {
        return parkingBoyService.findAllParkingBoy();
    }
```

#method:post
#path:"/parkingBoys"
#增加parkingBoys
```java
    @PostMapping("/parkingBoys")
       @ResponseBody
       public ParkingBoy addParkingLot(@RequestBody ParkingBoy parkingBoy) {
           return parkingBoyService.addParkingBoy( parkingBoy );
       }
```

#method:post
#path:"/parkingBoys"
#为parkingBoy增加parkingLot
```java
    @PostMapping("/parkingBoys")
       @ResponseBody
       public ParkingBoy addParkingLot(@RequestBody ParkingBoy parkingBoy) {
           return parkingBoyService.addParkingBoy( parkingBoy );
       }
```

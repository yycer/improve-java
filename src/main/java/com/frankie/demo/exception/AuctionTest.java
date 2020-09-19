package com.frankie.demo.exception;

/**
 * @author: Yao Frankie
 * @date: 2020/9/19 11:45
 */
public class AuctionTest {

    private double initPrice = 30.0;

    public static void main(String[] args) {

        AuctionTest at = new AuctionTest();
        try {
            // at.process("ab");
            at.process("20.10");
        } catch (AuctionException ae){
            System.out.println(ae.getMessage());
        }
    }

    private void process(String price) throws AuctionException {

        double d;

        try {
            d = Double.parseDouble(price);
        } catch (Exception e){
            e.printStackTrace();
            throw new AuctionException("竞拍价必须是数值!");
        }
        if (initPrice > d){
            throw new AuctionException("竞拍价低于起拍价!");
        }
        initPrice = d;
    }
}

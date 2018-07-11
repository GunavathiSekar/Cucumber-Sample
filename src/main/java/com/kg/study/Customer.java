package com.kg.study;

public class Customer {
    
        private int custid;
        private String name;
        private long phoneNumber;
        // String typeOfCustomer;
        private long purchaseAmount;
        private long pointsEarned;
    
        /**
         * @return the custid
         */
        Customer(){}
        Customer(int custid, String name, long phoneNumber,long purchaseAmount, long pointsEarned) {
            this.custid = custid;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.purchaseAmount = purchaseAmount;
            this.pointsEarned = pointsEarned;
    
        }
    
        public int getCustid() {
            return custid;
        }
    
        /**
         * @param custid the custid to set
         */
        public void setCustid(int custid) {
            this.custid = custid;
        }
    
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }
    
        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }
    
        /**
         * @return the phoneNumber
         */
        public long getPhoneNumber() {
            return phoneNumber;
        }
    
        /**
         * @param phoneNumber the phoneNumber to set
         */
        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        /**
         * @return the purchaseAmount
         */
        public long getPurchaseAmount() {
            return purchaseAmount;
        }
    
        /**
         * @param purchaseAmount the purchaseAmount to set
         */
        public void setPurchaseAmount(long purchaseAmount) {
            this.purchaseAmount = purchaseAmount;
        }
    
        /** 
         * @return the pointsEarned
         */
        public long getPointsEarned() {
            return pointsEarned;
        }
    
        /**
         * @param pointsEarned the pointsEarned to set
         */
        public void setPointsEarned(long pointsEarned) {
            this.pointsEarned = pointsEarned;
        }
    
        @Override
        public String toString() {
            return custid+" "+ name +" "+ phoneNumber+" "+ purchaseAmount+" " + pointsEarned;
        }
    
    }
package day6.activity2;

import java.time.LocalDate;
import java.time.Period;

public class MallParking {

		String vehicleNumber, mobile;
		Double amount;
		LocalDate inTime;
		LocalDate outTime;
		LocalDate currentTime;
		
		
		
		public MallParking() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MallParking(String vehicleNumber, String mobile, Double amount, LocalDate inTime, LocalDate outTime) {
			super();
			this.vehicleNumber = vehicleNumber;
			this.mobile = mobile;
			this.amount = amount;
			this.inTime = inTime;
			this.outTime = outTime;
		}
		public String getVehicleNumber() {
			return vehicleNumber;
		}
		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public LocalDate getInTime() {
			return inTime;
		}
		public void setInTime(LocalDate inTime) {
			this.inTime = inTime;
		}
		public LocalDate getOutTime() {
			return outTime;
		}
		public void setOutTime(LocalDate outTime) {
			this.outTime = outTime;
		}
		public LocalDate getCurrentTime() {
			return currentTime;
		}
		public void setCurrentTime(LocalDate currentTime) {
			this.currentTime = currentTime;
		}
		
		double calculateTotalFare() {
			return Period.between(this.inTime, this.outTime).getDays() * this.amount;
		}
	
}

package com.yuzk.decorator;

public interface ICar {
	void move();
}
class Car implements ICar{

	public void move() {
		System.out.println("汽车跑");
	}
}
class SuperCar extends Car{
	protected ICar car;
	public SuperCar(ICar car){
		super();
		this.car = car;
	}
	public void move(){
		car.move();
	}
}
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void move(){
		super.move();
		fly();
	}
	private void fly(){
		System.out.println("汽车飞");
	}
}
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	public void move(){
		super.move();
		swim();
	}
	private void swim(){
		System.out.println("汽车游泳");
	}
}
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	public void move(){
		super.move();
		automove();
	}
	private void automove(){
		System.out.println("汽车自己跑");
	}
}
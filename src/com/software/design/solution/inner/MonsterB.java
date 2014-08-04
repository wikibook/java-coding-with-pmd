package com.software.design.solution.inner;

public class MonsterB implements IMonster {

    //내부 클래스가 아니므로 생성자의 접근 제한이 private이 아니다.
    public MonsterB() {    }
    
    @Override
    public void forward() {}

    @Override
    public void backward() {}

    @Override
    public void turnLeft() {}

    @Override
    public void turnRight() {}

    @Override
    public void attact() {}

    @Override
    public void defence() {}

}
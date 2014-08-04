package com.software.design.problem.inner;

import com.software.design.problem.inner.MonsterFactory.IMonster;

public class MonsterController {

    public static void main(String[] args) {
        MonsterFactory factory = new MonsterFactory();
        IMonster monsterA = factory.makeMonster(0);
        IMonster monsterB = factory.makeMonster(1);
        IMonster monsterC = factory.makeMonster(2);
        //졍해지지 않은 유형으로 오류가 발생한다.
        IMonster monsterD = factory.makeMonster(3);
    }
}
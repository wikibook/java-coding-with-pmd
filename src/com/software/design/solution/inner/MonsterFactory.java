package com.software.design.solution.inner;

public class MonsterFactory {
    public IMonster makeMonster(int monsterType) throws NoClassDefFoundError {
        IMonster monster;
        switch (monsterType) {
        case 0:
            monster = new MonsterA();
            break;
        case 1:
            monster = new MonsterB();
            break;
        case 2:
            monster = new MonsterC();
            break;
        default:
            monster = null;
            throw new NoClassDefFoundError("�ش� ���ʹ� �������� �ʽ��ϴ�.");
        }
        
        return  monster;
    }
}

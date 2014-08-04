package com.software.design.problem.inner;

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
    
    public interface IMonster {
        void forward();
        void backward();
        void turnLeft();
        void turnRight();
        void attact();
        void defence();
    }
    

    public class MonsterA implements IMonster {

        private int type = 0;
        private String name = "������";
        
        private MonsterA(){};
        
        @Override
        public void forward() {    }

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
    
    public class MonsterB implements IMonster {

        private int type = 1;
        private String name = "��ũ";
        
        private MonsterB(){};
        
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
    
    public class MonsterC implements IMonster {

        private int type = 2;
        private String name = "����";
        
        private MonsterC(){};
        
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
}
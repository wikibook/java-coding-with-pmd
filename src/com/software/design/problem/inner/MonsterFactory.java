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
            throw new NoClassDefFoundError("해당 몬스터는 존재하지 않습니다.");
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
        private String name = "슬라임";
        
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
        private String name = "오크";
        
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
        private String name = "보스";
        
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
class LockingTree {

    int[] parent;

    ArrayList<Integer>[] child;
    int[] locked;    
    int size;

    public LockingTree(int[] p) {
        this.parent = p;

        this.size = this.parent.length;

        locked = new int[size];

        child = new ArrayList[size];

        for (int i = 0; i < size; i++) {
            this.child[i] = new ArrayList<>();
        }

        for(int i=1; i < size; i++){
            this.child[parent[i]].add(i);
        }

    }
    
    public boolean lock(int num, int user) {
        if(locked[num] != 0){
            return false;
        }

        locked[num] = user;

        return true;
    }
    
    public boolean unlock(int num, int user) {

        if(locked[num] == 0) return false;

        if(locked[num] != user) return false;

        locked[num] = 0;

        return true;
    }
    
    public boolean upgrade(int num, int user) {

        if(locked[num] != 0) return false;

        if(isLockedAncestor(num)) return false;

        ArrayList<Integer> allDescendent = new ArrayList<>();

        getAllDescendent(num , allDescendent);

        if(allDescendent.size() == 0) return false;

        for(int  curr : allDescendent){
            locked[curr] = 0;
        }

        locked[num] = user;
        
        return true;
    }

    public void getAllDescendent(int num , ArrayList<Integer> allDescendent){

        for(int curr : child[num]){

            if(locked[curr] != 0){
                allDescendent.add(curr);
            }

            getAllDescendent(curr , allDescendent);
        }
    }

    public boolean isLockedAncestor(int num){

         int p = parent[num];

    while (p != -1) {
        if (locked[p] != 0) {
            return true;
        }

        p = parent[p];
    }

        return false;
    }
        

    }


/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
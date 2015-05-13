/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class EmployeeTree{
    public class Employee{
        int id;
        String name;
        Employee lchild;
        Employee rchild;
        public Employee(int id, String name){
            this.id = id;
            this.name = name;
            lchild = null;
            rchild = null;
        }
        
       
    }
    
    private Employee root;
    
    public void insert(int id, String name){
        Employee temp = new Employee(id, name);
        if(root == null){
            root = temp;
            return;
        }else{
            Employee current = root;
            Employee parent = null;
            while(current != null){
                parent = current;
                if(current.id < id){
                    current = current.rchild;
                }else if(current.id > id){
                    current = current.lchild;
                }else{
                    System.out.print("Duplicate");
                    return;
                }
            }
            if(parent.id < id){
                parent.rchild = temp;
            }else{
                parent.lchild = temp;
            }
        }
    }
    
    public Employee find(int key){
        Employee current = root;
        while(current != null){
            if(current.id < key){
                current = current.rchild;
            }else if(current.id > key){
                current = current.lchild;
            }else if(current.id == key){
                return current;
            }
            
        }
        return null;
    }
    public void preOrder(Employee E){
        if(E != null){
            System.out.println(E.id + " " + E.name + " ");
            inOrder(E.lchild);
            inOrder(E.rchild);
        }
    }
    public void inOrder(Employee E){
        if(E != null){
            inOrder(E.lchild);
            System.out.println(E.id + " " + E.name + " ");
            inOrder(E.rchild);
        }
    }
    
    public void posOrder(Employee E){
        if(E != null){
            inOrder(E.lchild);
            inOrder(E.rchild);
            System.out.println(E.id + " " + E.name + " ");
        }
    }
    
    public static void main(String[] args){
        EmployeeTree tree = new EmployeeTree();
        tree.insert(1, "bob");
        tree.insert(2, "jill");
        tree.insert(3, "jane");
        tree.insert(4, "bobby");
        tree.insert(5, "jimmy");
        tree.insert(6, "jim");
        tree.insert(7, "john");
        tree.insert(8, "tim");
        tree.insert(9, "tod");
        
    }
}

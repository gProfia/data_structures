#include <iostream>

class Node{
    private: 
        int value;
        Node* next;
    
    public:
        Node (int value){
            this->value = value; 
            this->next = nullptr;
        }
        int get_value(){return this->value;}
        void set_next(Node n){this->next = n;}
};


int main(){
    Node a = Node(3);

    std::cout << a.get_value() << std::endl;
    return 0;
    
}
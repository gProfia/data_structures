#include <iostream>
#include <string>
using namespace std;

class Node{
    private: 
        int value;
        Node* next;
    
    public:
        Node (int value)
        {
            this->value = value; 
            this->next = nullptr;
        }
        int get_value(){return this->value;}
        void set_next(Node* n){this->next = n;}
        Node* get_next(){return this->next;}
};

class LinkedList{
    private:
        int size;
        Node * root;

    public:
        LinkedList()
        {
            this->size = 0;
            this->root = nullptr;
        }
        void add_node(Node* n)
        {
            Node * tmp = this->root;

            if(this->root == nullptr)
                this->root = n;
            else
            {
                while(tmp->get_next() != nullptr);
                tmp->set_next(n);
            }                                
            this->size++;
        }
        void print_list()
        {
            Node* tmp = this->root;
            string a = "[";            
            while(tmp != nullptr)
            {
                a += to_string(tmp->get_value());
                tmp = tmp->get_next();
                if(tmp)
                    a += ", ";
            }
            a += "]";
            std::cout << a << std::endl;
        }
};

int main(){
    Node* a = new Node(3);
    Node* b = new Node(42);
    LinkedList* ll = new LinkedList();
    ll->add_node(a);
    ll->add_node(b);

    ll->print_list();

    //std::cout << a.get_value() << std::endl;
    return 0;
    
}
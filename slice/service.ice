[["java:package:cn.hassan.ice"]]
module book{
    struct Message {
        string  name;
        int type;
        bool valid;
        double price;
        string content;
    };

    interface onlineBook{
        Message bookTick(Message msg);
    };
};
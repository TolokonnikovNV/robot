package edu.javacourse.myQueue;


public class Queue {
    private Box head = null;
    private Box tail = null;
    private int size = 0;

    public void pushPriority(Object object, int priority) {
        Box box = new Box(object, priority);
        if (size == 0) {
            head = box;
        } else if (size == 1) {
            if (head.getPriority() > box.getPriority()) {
                Box tempHead = head;
                head = box;
                head.setNext(tempHead);

            } else {
                head.setNext(box);
            }
        } else {
            Box current = head;
            if (current.getPriority() > box.getPriority()) {
                box.setNext(current);
                head = box;
            } else {
                for (int i = 1; i < size; i++) {
                    if (current.getNext().getPriority() <= box.getPriority()) {
                        current = current.getNext();
                    }
                }

                if (current.getNext() == null) {
                    current.setNext(box);
                } else {
                    Box tempNext = current.getNext();
                    current.setNext(box);
                    box.setNext(tempNext);
                }

            }
        }

        size++;
    }

    public void push(Object object) {
        Box box = new Box(object);
        box.setPullMe(true);
        if (head == null) {
            head = box;

        } else {
            tail.setNext(box);
            tail.setPullMe(false);
        }
        Box temp = tail;
        tail = box;
        tail.setPrev(temp);
        size++;

    }

    public Object pullLIFO() {
        while (size > 0) {
            if (tail.isPullMe()) {
                Box box = tail;
                if (size != 1) {
                    tail = tail.getPrev();
                    tail.setPullMe(true);
                    box.setPullMe(false);
                }
                size--;
                return box.getObject();
            }
        }
        return null;
    }

    public Object pullBack() {
        if (size == 0) {
            return null;
        }
        Object object = tail.getObject();
        tail = tail.getPrev();
        size--;
        return object;
    }

    public Object pullForward() {
        if (size == 0) {
            return null;
        }
        Object object = head.getObject();
        head = head.getNext();
        size--;
        return object;
    }

    public int getSize() {
        return size;
    }

    private class Box {
        Object object;
        Box next;
        Box prev;
        boolean pullMe;
        int priority;

        public Box(Object object) {
            this.object = object;
        }

        public Box(Object object, int priority) {
            this.object = object;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public boolean isPullMe() {
            return pullMe;
        }

        public void setPullMe(boolean pullMe) {
            this.pullMe = pullMe;
        }

        public Box getPrev() {
            return prev;
        }

        public void setPrev(Box prev) {
            this.prev = prev;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public Box getNext() {
            return next;
        }

        public void setNext(Box next) {
            this.next = next;
        }


    }
}

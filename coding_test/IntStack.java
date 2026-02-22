public class IntStack {
    private int[] stack;
    private int capacity;
    private int pointer;

    // 빈 스택 오류
    public class EmptyIntStackExceptioon extends RuntimeException {
        public EmptyIntStackExceptioon() {
        }
    }

    // 가득찬 스택 오류
    public class OverflowIntStackExceptioon extends RuntimeException {
        public OverflowIntStackExceptioon() {
        }
    }

    // 생성자
    public IntStack(int maxlen) {
        pointer = 0;
        capacity = maxlen;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    // push
    public int push(int x) throws OverflowIntStackExceptioon {
        if (pointer >= capacity)
            throw new OverflowIntStackExceptioon();
        return stack[pointer++] = x;
    }

    // pop
    public int pop() throws EmptyIntStackExceptioon {
        if (pointer <= 0)
            throw new EmptyIntStackExceptioon();
        return stack[--pointer];
    }

    // peek
    public int peek() throws EmptyIntStackExceptioon {
        if (pointer <= 0)
            throw new EmptyIntStackExceptioon();
        return stack[pointer - 1];
    }

    // clear
    public void clear() {
        pointer = 0;
    }

    // 인덱스 찾기
    public int indexOf(int x) {
        for (int i = pointer - 1; i >= 0; i--)
            if (stack[i] == x)
                return i;
        return -1;
    }

    // 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 데이터 개수 반환
    public int size() {
        return pointer;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return pointer <= 0;
    }

    // 스택이 가득 찼는지 확인
    public boolean isFul() {
        return pointer >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if (pointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < pointer; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
}

package algorithms_1_3.linkedList;

public interface List<E> {
    /**
     * 리스트에서 특정 노드를 찾음
     *
     * @param index 리스트에서 조회하려는 특정 위치 변수
     * @return 리스트의 특정 위치에 있는 노드
     */
    Node<E> search(int index);

    /**
     * 노드를 리스트의 특정 위치에 추가
     * 특정 위치 및 이후의 노드는 한 칸씩 밀려남
     *
     * @param index 노드를 추가할 리스트의 특정 위치 변수
     * @param value 리스트에 추가할 노드
     */
    void add(int index, E value);

    /**
     * 리스트에 있는 특정 노드 삭제
     * 이때, 동일한 노드가 여러 개가 있다면 제일 처음 발견한 노드를 삭제
     *
     * @param index 삭제하려는 특정 노드 위치 변수
     * @return 리스트에서 삭제할 노드가 없거나 삭제에 실패한다면 false, 삭제에 성공한다면 true
     */
    E remove(int index);

    /**
     * 리스트에서 특정 값을 가진 노드의 데이터가 있는지 여부 확인
     *
     * @param value 리스트에서 조회하려는 특정 노드
     * @return 리스트에 특정 값을 가진 노드가 없다면 false, 노드가 있다면 true
     */
    boolean remove(Object value);

    /**
     * 리스트에 있는 특정 위치의 노드
     *
     * @param index 리스트에서 접근하려는 위치 변수
     * @return 리스트의 특정 위치에 있는 노드
     */
    E get(int index);

    /**
     * 리스트에서 특정 위치에 있는 노드를 새로운 노드로 변경
     *
     * @param index 리스트에서 접근하려는 위치 변수
     * @param value 변경할 새로운 노드
     */
    void set(int index, E value);

    /**
     * 리스트에 특정 노드가 있는지 여부 확인
     *
     * @param value 리스트에서 조회하려는 특정 노드
     * @return 리스트에 특정 노드가 존재하지 않는다면 false, 특정 노드가 존재한다면 true
     */
    boolean contains(Object value);

    /**
     * 리스트에 있는 특정 노드의 위치 변수
     *
     * @param value 리스트에서 조회하려는 특정 노드
     * @return 리스트에 있는 특정 요소의 위치 변수. 만약 일치하는 노드가 없다면 `-1`
     */
    int indexOf(Object value);

    /**
     * 리스트에 있는 노드의 개수
     *
     * @return 리스트에 있는 노드의 개수
     */
    int size();

    /**
     * 리스트가 비어있는지 여부 확인
     *
     * @return 리스트에 노드가 있다면 false, 노드가 없다면 true
     */
    boolean isEmpty();

    /**
     * 리스트의 노드를 전부 제거
     */
    void clear();
}

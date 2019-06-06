import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImmutableListTest {

    @Test
    public void shouldCreateEmpty() {
        ImmutableList<Integer> list = new ImmutableList<>();

        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    public void shouldAppendCreatingNewList() {
        ImmutableList<Integer> originalList = new ImmutableList<>();
        ImmutableList<Integer> updatedList = originalList.append(10);

        assertThat(updatedList.head()).isEqualTo(10);
    }

    @Test
    public void shouldNotUpdateOriginalList() {
        ImmutableList<Integer> originalList = new ImmutableList<>();
        originalList.append(10);

        assertThat(originalList.size()).isEqualTo(0);
    }
}

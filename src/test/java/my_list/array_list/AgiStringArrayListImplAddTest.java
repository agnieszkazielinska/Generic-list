package my_list.array_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgiStringArrayListImplAddTest {

    @Test
    public void shouldAddElementToList() {
        AgiStringArrayListImpl list = new AgiStringArrayListImpl(17);
        list.add("pimpek");
        list.add("pjes");
        list.add("wilczurek");

        assertEquals(3, list.length());
        assertEquals(17, list.size());
        assertEquals("pimpek", list.get(0));
    }

    @Test
    public void shouldNotAddElementToList() {
        AgiStringArrayListImpl list = new AgiStringArrayListImpl(3);
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(3, list.length());
        assertEquals(3, list.size());
        assertEquals("C", list.get(2));
        list.add("D");
        assertEquals(false, list.add("D"));
    }

    @Test
    public void shouldTestIfContains() {
        AgiStringArrayListImpl wilczurkowie = new AgiStringArrayListImpl(4);
        wilczurkowie.add("Agi");
        wilczurkowie.add("Kacpi");
        wilczurkowie.add("Barnabasz");
        wilczurkowie.add("Chmurka");

        assertEquals(true, wilczurkowie.contain("Barnabasz"));
        assertEquals(false, wilczurkowie.contain("Adas"));
    }

    @Test
    public void shouldRemoveElementFromArray() {
        AgiStringArrayListImpl wilczurkowie = new AgiStringArrayListImpl(4);
        wilczurkowie.add("Agi");
        wilczurkowie.add("Kacpi");
        wilczurkowie.add("Chmurka");
        wilczurkowie.add("Barnabasz");

        wilczurkowie.remove("Chmurka");
        assertEquals(4, wilczurkowie.length());
        assertEquals(3, wilczurkowie.size());
        assertEquals("Barnabasz", wilczurkowie.get(2));

    }

    @Test
    public void shouldGiveIndexOfString() {
        AgiStringArrayListImpl wilczurkowie = new AgiStringArrayListImpl(4);
        wilczurkowie.add("Agi");
        wilczurkowie.add("Kacpi");
        wilczurkowie.add("Chmurka");
        wilczurkowie.add("Barnabasz");


        assertEquals(3, wilczurkowie.indexOf("Barnabasz"));
        assertEquals(-1, wilczurkowie.indexOf("Adas"));
    }

    @Test
    public void shouldGiveLastIndexOfString() {
        AgiStringArrayListImpl wilczurkowie = new AgiStringArrayListImpl(6);
        wilczurkowie.add("Agi");
        wilczurkowie.add("Kacpi");
        wilczurkowie.add("Chmurka");
        wilczurkowie.add("Barnabasz");
        wilczurkowie.add("Kacpi");
        wilczurkowie.add("Adas");

        assertEquals(4, wilczurkowie.lastIndexOf("Kacpi"));
    }

    @Test
    public void shouldCheckIfContainsAll() {
        AgiStringArrayListImpl arr1 = new AgiStringArrayListImpl(6);
        arr1.add("X");
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");


        String[] arr2 = {"A", "B", "C"};
        String[] arr3 = {"X", "Y", "Z"};
        String[] arr4 = {"A", "B", "Z"};
        String[] arr5 = {"A", "B", "C"};


        assertFalse(arr1.containAll(arr4));
        assertTrue(arr1.containAll(arr5));

    }

    @Test
    public void shouldAddAll() {
        AgiStringArrayListImpl arr1 = new AgiStringArrayListImpl(6);
        arr1.add("A");
        arr1.add("F");
        arr1.add("D");
        arr1.add("C");
        arr1.add("B");
        arr1.add("G");

        String[] arr3 = {"X", "Y", "Z"};

        arr1.addAll(arr3);


        assertEquals(9, arr1.length());
        assertEquals("X", arr1.get(6));
    }

    @Test
    public void shouldGiveSublist() {
        AgiStringArrayListImpl arr1 = new AgiStringArrayListImpl(6);
        arr1.add("A");
        arr1.add("F");
        arr1.add("D");
        arr1.add("C");
        arr1.add("B");
        arr1.add("G");

        arr1.sublist(2, 4);

        for (int i = 0; i < arr1.length(); i++) {
            System.out.println(arr1.get(i));

        }
        assertEquals(3, arr1.length());

    }
}
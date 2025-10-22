// https://takeuforward.org/plus/dsa/problems/design-phone-directory
class PhoneDirectory {
  HashMap<Integer, Integer> available;
  List<Integer> inUse;

  public PhoneDirectory(int maxNumbers) {
    available = new HashMap<>();
    inUse = new ArrayList<>();
    for (int i = 0; i <maxNumbers; i++) {
      available.put(i, available.getOrDefault(i, 0) + 1);
    }
  }

  public int get() {
    int value = 0;
    for (int key : available.keySet()) {
      if (available.get(key) != 0) {
        value = key;
        inUse.add(value);
        available.put(key, 0);
        break;
      }
    }
    return value;
  }

  public boolean check(int number) {
    return available.get(number) == 1 ? true : false;
  }

  public void release(int number) {
    if (inUse.contains(Integer.valueOf(number))) {
      inUse.remove(Integer.valueOf(number));
      available.put(number, 1);
    }
  }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such: PhoneDirectory obj = new
 * PhoneDirectory(maxNumbers); int param_1 = obj.get(); boolean param_2 = obj.check(number);
 * obj.release(number);
 */

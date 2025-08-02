public int walkDogs(int hour) {
    int dogsWalked = company.numAvailableDogs(hour);
    if (dogsWalked > maxDogs) {
        dogsWalked = maxDogs;
    }

    company.updateDogs(hour, dogsWalked);

    return dogsWalked;
}

public int dogWalkShift(int startHour, int endHour) {
    int profit = 0;
    for (int hour = startHour; hour <= endHour; hour++) {
        int dogsWalked = walkDogs(hour);
        if ((dogsWalked == maxDogs) || (9 <= hour && hour <= 17)) {
            profit += 3;
        }
        profit += (dogsWalked * 5);
    }

    return profit;
}
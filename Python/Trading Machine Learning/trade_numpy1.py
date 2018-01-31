"""Creating NumPy arrays"""

import numpy as np

def test_run():

    # List to 1D array
    print(np.array([1,2,3]))

    # List of tuples to 2D array
    print(np.array([(1,2,3),(4,5,6)]))

    # Empty array
    print(np.empty(5))
    print(np.empty((5,4))) # Not really empty since it takes random values stored in memory

    # Array of ones
    print(np.ones((5,4),dtype=np.int)) # To get integers datatype instead of default double we specify the datatype

    # Array of zeros
    print(np.zeros((3,3), dtype=np.int))

    # Array of random numbers sampled between 0.0 and 1.0
    print(np.random.random((3,3)))

    # Sample numbers with Gaussian (normal) distribution, mean = 50, standard deviation = 10 and size=(2,3)
    print(np.random.normal(50,10,size=(2,3)))

    # Random integers
    print(np.random.randint(0,10,size=5)) # Sample integers [0,10) as 1D array with size 5
    a = np.random.randint(0, 10, size=(2,3))
    print(a) # 2x3 array
    print(a.shape[0]) # Returns the number of rows
    print(a.shape[1]) # Returns the number of columns

    # Test whether this is a 2D array
    b = a.shape
    print(len(b))

    # The amount of elements in the array (2x3=6) and the datatype of the elements
    print(a.size)
    print(a.dtype)

    # Use seed for random numbers to reappear identically every time we compile the program
    np.random.seed(693)
    c = np.random.randint(0, 10, size=(2, 3))
    print("Array: ", c)

    # Print the sum of all elements in the previous array
    print("The sum of the elements is: ", c.sum())

    # Iterate over each row to compute the sum of each column
    print("The sum of each column is: ", c.sum(axis=0))

    # Iterate over each column to compute the sum of each row
    print("The sum of each row is: ", c.sum(axis=1))

    #Statistics: min, max, mean (across rows, cols and overall)
    print("Minimum of each column:\n", c.min(axis=0))
    print("Maximum of each row:\n", c.max(axis=1))
    print("Mean of all elements: ", c.mean())

if __name__ == "__main__":
    test_run()



"""Plot a pair of columns of IBM"""

import pandas as pd
import matplotlib.pyplot as plt

def test_run():
    df = pd.read_csv("data/IBM.csv")
    # TODO: Your code here
    print(df[['Close', 'Adjusted Close']]) # Extract a pair of columns
    df[['Close', 'Adjusted Close']].plot() # Plot the pair of columns

    plt.show()  # must be called to show plots


if __name__ == "__main__":
    test_run()



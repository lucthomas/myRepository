"""Plot High prices for IBM"""

import pandas as pd
import matplotlib.pyplot as plt

def test_run():
    df = pd.read_csv("data/IBM.csv")
    # TODO: Your code here
    print(df['High']) # Extract high prices
    df['High'].plot() # Plot the extracted high prices
    plt.title('Yeah, plot it!')
    plt.show()  # must be called to show plots


if __name__ == "__main__":
    test_run()



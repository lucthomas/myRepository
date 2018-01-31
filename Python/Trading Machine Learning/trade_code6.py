'''Utility functions'''

import os
import pandas as pd
import matplotlib.pyplot as plt

def plot_selected(df, columns, start_index, end_index):
    """Plot the desired columns over index values in the given range."""
    # TODO: Your code here
    # Note: DO NOT modify anything else!
    plot_data(df.ix[start_index:end_index,columns], title="Selected data")

def symbol_to_path(symbol, base_dir="data"):
    """Return CSV file path given ticker symbol"""
    return os.path.join(base_dir, "{}.csv".format(str(symbol)))

def get_data(symbols, dates):
    """Read stock data (adjusted close) for given symbols from CSV files"""
    df = pd.DataFrame(index=dates)
    #Add SPY for reference if absent
    if 'SPY' not in symbols:
        symbols.insert(0,'SPY')

    for symbol in symbols:
        #TODO: Read and join data for each symbol
        df_temp = pd.read_csv(symbol_to_path(symbol), index_col='Date', parse_dates=True, usecols=['Date', 'Adj Close'], na_values=['nan'])
        df_temp = df_temp.rename(columns={'Adj Close': symbol})
        df = df.join(df_temp)
        #Drop dates SPY did not trade to avoid NaN numbers
        if symbol == 'SPY':
            df = df.dropna(subset=["SPY"])

    return df

def normalize_data(df):
    """Normalize stock prices using the first row of the dataframe"""
    return df/df.ix[0,:]

def plot_data(df, title="Stock Prices"):
    # Plot stock prices
    ax = df.plot(title=title, fontsize=12)
    ax.set_xlabel("Date")
    ax.set_ylabel("Price")
    plt.show() # Call this to show plots

def test_run():
    # Define a date range
    dates = pd.date_range('2010-01-01', '2010-12-31') # The year 2010

    # Choose stock symbols to read
    symbols = ['GOOG', 'IBM', 'GLD'] # SPY will be added in get_data()

    # Get stock data
    df = get_data(symbols, dates)
    print(df)

    # Slice by row range (dates) using DataFrame.ix[] selector
    df_slice_row = df.ix['2010-01-01':'2010-01-31'] # The month of January
    print(df_slice_row)

    # Slice by symbol (columns)
    df_slice_col = df['GOOG']
    print(df_slice_col)

    df_slice_cols = df[['IBM', 'GLD']]
    print(df_slice_cols)

    # Slice row and column
    print(df.ix['2010-01-01':'2010-01-31', ['IBM', 'GLD']])

    # Normalize data
    normalize_data(df)

    # Slice and plot
    plot_selected(df, ['SPY', 'IBM'], '2010-03-01', '2010-04-01')

if __name__ == "__main__":
    test_run()
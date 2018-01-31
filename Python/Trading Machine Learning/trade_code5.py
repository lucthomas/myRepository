'''Build a dataframe in pandas'''
import pandas as pd

def test_run():
    #Create dates
    start_date = '2010-01-22'
    end_date = '2010-01-26'
    dates = pd.date_range(start_date,end_date)
    print(dates)
    print(dates[0])

    #Create an empty dataframe
    df1 = pd.DataFrame(index=dates)
    print(df1)

    #Read SPY data into temporary dataframe and change its index to dates rather than 0,1,2,...
    #Only use the columns of the csv we're interest in and indicata that nan are not a number
    dfSPY = pd.read_csv("data/SPY.csv",index_col="Date",parse_dates=True,usecols=['Date','Adj Close'],na_values=['nan'])
    #Rename 'Adj Close' column to 'SPY' to prevent a clash
    dfSPY = dfSPY.rename(columns={'Adj Close':'SPY'})

    #Join the two dataframes using DataFrame.join()
    #df1 = df1.join(dfSPY)

    #Drop the NaN values
    #df1 = df1.dropna()

    #Refactor join and drop of NaN values which happens when you only keep the dates common to both columns (df1 and dfSPY)
    df1 = df1.join(dfSPY,how='inner')
    print(df1)

    #Read in more stocks
    symbols = ['GOOG','IBM','GLD']
    for symbol in symbols:
        df_temp = pd.read_csv("data/{}.csv".format(symbol),index_col="Date",parse_dates=True,usecols=['Date','Adj Close'],na_values=['nan'])
        #Rename 'Adj Close' column to symbol to prevent a clash
        df_temp = df_temp.rename(columns={'Adj Close': symbol})
        df=df1.join(df_temp) #Use default how='left'
    print(df)

    #Note that we are using a couple of methods a couple of times
    #This is not nice programming
    #Let's put this into utility functions that we can use afterwards (see trade_code6.py)

if __name__ == "__main__":
    test_run()



//
//  PlayingCard.m
//  Matchismo
//
//  Created by jayoung on 11/9/13.
//  Copyright (c) 2013 jamsyoung. All rights reserved.
//

#import "PlayingCard.h"

@implementation PlayingCard


- (int)match:(NSArray *)otherCards
{
    int score = 0;

    if ([otherCards count] == 1) {
        PlayingCard *otherCard = [otherCards firstObject];
        if ([self.suit isEqualToString:otherCard.suit]) {
            score = 1;
        } else if (self.rank == otherCard.rank) {
            score = 4;
        }
    }
    return score;
}


- (NSString *)contents
{
    NSArray *rankStrings = [PlayingCard rankStrings];
    return [rankStrings[self.rank] stringByAppendingString:self.suit];
}



// suit getter and setter
@synthesize suit = _suit;


- (NSString *)suit
{
    return _suit ? _suit : @"?";
}


- (void)setSuit:(NSString *)suit
{
    if ([[PlayingCard validSuits] containsObject:suit]) {
        _suit = suit;
    }
}



// rank setter
- (void)setRank:(NSUInteger)rank
{
    if (rank <= [PlayingCard maxRank]) {
        _rank = rank;
    }
}



// class methods
+ (NSArray *)validSuits
{
    return @[@"♥", @"♦", @"♠", @"♣"];
}


+ (NSArray *)rankStrings
{
    return @[@"?", @"A", @"2", @"3", @"4", @"5", @"6", @"7", @"8", @"9", @"10", @"J", @"Q", @"K"];
}


+ (NSUInteger)maxRank
{
    return [[self rankStrings] count] - 1; // why is this self, and not PlayingCard?
}


@end

//
//  PlayingCard.h
//  Matchismo
//
//  Created by jayoung on 4/20/13.
//  Copyright (c) 2013 jamsyoung. All rights reserved.
//

#import "Card.h"

@interface PlayingCard : Card

@property (strong, nonatomic) NSString *suit;
@property (nonatomic) NSUInteger rank;

+ (NSArray *)validSuits;
+ (NSUInteger)maxRank;

@end

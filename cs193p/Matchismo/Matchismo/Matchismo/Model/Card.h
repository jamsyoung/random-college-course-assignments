//
//  Card.h
//  Matchismo
//
//  Created by jayoung on 11/9/13.
//  Copyright (c) 2013 jamsyoung. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Card : NSObject

@property (strong, nonatomic) NSString *contents;
@property (nonatomic, getter=isChosen) BOOL chosen;
@property (nonatomic, getter=isMatched) BOOL matched;

- (int)match:(NSArray *)otherCards;

@end

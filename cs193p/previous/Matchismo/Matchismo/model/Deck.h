//
//  Deck.h
//  Matchismo
//
//  Created by jayoung on 4/20/13.
//  Copyright (c) 2013 jamsyoung. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Card.h"

@interface Deck : NSObject

- (void)addCard:(Card *)card atTop:(BOOL)atTop;

- (Card *)drawRandomCard;

@end
